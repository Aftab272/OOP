-- ================================
-- SUPABASE DATABASE QUICK SETUP
-- Copy and paste this ENTIRE script into Supabase SQL Editor
-- ================================

-- Enable necessary extensions
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- 1. Categories Table
CREATE TABLE IF NOT EXISTS categories (
  id UUID DEFAULT uuid_generate_v4() PRIMARY KEY,
  name VARCHAR(255) NOT NULL UNIQUE,
  description TEXT,
  created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
  updated_at TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);

-- 2. Products Table
CREATE TABLE IF NOT EXISTS products (
  id UUID DEFAULT uuid_generate_v4() PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  sku VARCHAR(100) UNIQUE NOT NULL,
  barcode VARCHAR(100),
  category_id UUID REFERENCES categories(id),
  price DECIMAL(10,2) NOT NULL DEFAULT 0,
  cost DECIMAL(10,2) DEFAULT 0,
  stock INTEGER NOT NULL DEFAULT 0,
  min_stock INTEGER DEFAULT 10,
  status VARCHAR(20) DEFAULT 'active',
  description TEXT,
  created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
  updated_at TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);

-- 3. Users Table (extends Supabase auth.users)
CREATE TABLE IF NOT EXISTS users (
  id UUID REFERENCES auth.users(id) PRIMARY KEY,
  email VARCHAR(255) NOT NULL,
  full_name VARCHAR(255),
  role VARCHAR(50) DEFAULT 'cashier',
  status VARCHAR(20) DEFAULT 'active',
  created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
  updated_at TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);

-- 4. Customers Table
CREATE TABLE IF NOT EXISTS customers (
  id UUID DEFAULT uuid_generate_v4() PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  email VARCHAR(255),
  phone VARCHAR(50),
  address TEXT,
  total_purchases DECIMAL(12,2) DEFAULT 0,
  loyalty_points INTEGER DEFAULT 0,
  status VARCHAR(20) DEFAULT 'active',
  created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
  updated_at TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);

-- 5. Sales Table
CREATE TABLE IF NOT EXISTS sales (
  id UUID DEFAULT uuid_generate_v4() PRIMARY KEY,
  sale_number VARCHAR(50) UNIQUE NOT NULL,
  customer_id UUID REFERENCES customers(id),
  user_id UUID REFERENCES users(id),
  sale_date TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
  subtotal DECIMAL(10,2) NOT NULL DEFAULT 0,
  tax_amount DECIMAL(10,2) DEFAULT 0,
  total_amount DECIMAL(10,2) NOT NULL DEFAULT 0,
  payment_method VARCHAR(50) NOT NULL,
  status VARCHAR(20) DEFAULT 'completed',
  created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);

-- 6. Sale Items Table
CREATE TABLE IF NOT EXISTS sale_items (
  id UUID DEFAULT uuid_generate_v4() PRIMARY KEY,
  sale_id UUID REFERENCES sales(id) ON DELETE CASCADE,
  product_id UUID REFERENCES products(id),
  quantity INTEGER NOT NULL,
  unit_price DECIMAL(10,2) NOT NULL,
  total_price DECIMAL(10,2) NOT NULL,
  created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);

-- ================================
-- INSERT SAMPLE DATA
-- ================================

-- Sample Categories
INSERT INTO categories (name, description) VALUES
('Electronics', 'Electronic devices and gadgets'),
('Mobile Phones', 'Smartphones and mobile accessories'),
('Computers', 'Laptops, desktops, and computer accessories'),
('Accessories', 'Various tech accessories')
ON CONFLICT (name) DO NOTHING;

-- Sample Products
INSERT INTO products (name, sku, barcode, category_id, price, cost, stock, min_stock, description) 
SELECT 
  'iPhone 15 Pro',
  'IP15PRO-001',
  '1234567890123',
  c.id,
  1199.99,
  899.00,
  25,
  10,
  'Latest iPhone with Pro features'
FROM categories c WHERE c.name = 'Mobile Phones'
ON CONFLICT (sku) DO NOTHING;

INSERT INTO products (name, sku, barcode, category_id, price, cost, stock, min_stock, description) 
SELECT 
  'Samsung Galaxy S24',
  'SGS24-001',
  '2345678901234',
  c.id,
  999.99,
  749.00,
  30,
  15,
  'Latest Samsung flagship phone'
FROM categories c WHERE c.name = 'Mobile Phones'
ON CONFLICT (sku) DO NOTHING;

INSERT INTO products (name, sku, barcode, category_id, price, cost, stock, min_stock, description) 
SELECT 
  'MacBook Air M3',
  'MBA-M3-001',
  '3456789012345',
  c.id,
  1499.99,
  1199.00,
  15,
  5,
  'New MacBook Air with M3 chip'
FROM categories c WHERE c.name = 'Computers'
ON CONFLICT (sku) DO NOTHING;

INSERT INTO products (name, sku, barcode, category_id, price, cost, stock, min_stock, description) 
SELECT 
  'AirPods Pro 2',
  'APP2-001',
  '4567890123456',
  c.id,
  249.99,
  179.00,
  50,
  20,
  'Active noise cancelling earbuds'
FROM categories c WHERE c.name = 'Accessories'
ON CONFLICT (sku) DO NOTHING;

INSERT INTO products (name, sku, barcode, category_id, price, cost, stock, min_stock, description) 
SELECT 
  'iPad Pro 12.9',
  'IPP129-001',
  '5678901234567',
  c.id,
  1299.99,
  999.00,
  20,
  8,
  'Professional tablet with M2 chip'
FROM categories c WHERE c.name = 'Electronics'
ON CONFLICT (sku) DO NOTHING;

-- Sample Customers
INSERT INTO customers (name, email, phone, address) VALUES
('John Doe', 'john@example.com', '+1-555-0101', '123 Main St, City, State'),
('Jane Smith', 'jane@example.com', '+1-555-0102', '456 Oak Ave, City, State'),
('Mike Johnson', 'mike@example.com', '+1-555-0103', '789 Pine Rd, City, State'),
('Sarah Wilson', 'sarah@example.com', '+1-555-0104', '321 Elm St, City, State'),
('David Brown', 'david@example.com', '+1-555-0105', '654 Maple Dr, City, State')
ON CONFLICT DO NOTHING;

-- ================================
-- ENABLE ROW LEVEL SECURITY (RLS)
-- ================================

ALTER TABLE categories ENABLE ROW LEVEL SECURITY;
ALTER TABLE products ENABLE ROW LEVEL SECURITY;
ALTER TABLE customers ENABLE ROW LEVEL SECURITY;
ALTER TABLE users ENABLE ROW LEVEL SECURITY;
ALTER TABLE sales ENABLE ROW LEVEL SECURITY;
ALTER TABLE sale_items ENABLE ROW LEVEL SECURITY;

-- ================================
-- CREATE POLICIES (Allow all for authenticated users)
-- ================================

-- Categories policies
DROP POLICY IF EXISTS "Allow all for authenticated users" ON categories;
CREATE POLICY "Allow all for authenticated users" ON categories
  FOR ALL USING (true);

-- Products policies
DROP POLICY IF EXISTS "Allow all for authenticated users" ON products;
CREATE POLICY "Allow all for authenticated users" ON products
  FOR ALL USING (true);

-- Customers policies
DROP POLICY IF EXISTS "Allow all for authenticated users" ON customers;
CREATE POLICY "Allow all for authenticated users" ON customers
  FOR ALL USING (true);

-- Users policies
DROP POLICY IF EXISTS "Allow all for authenticated users" ON users;
CREATE POLICY "Allow all for authenticated users" ON users
  FOR ALL USING (true);

-- Sales policies
DROP POLICY IF EXISTS "Allow all for authenticated users" ON sales;
CREATE POLICY "Allow all for authenticated users" ON sales
  FOR ALL USING (true);

-- Sale items policies
DROP POLICY IF EXISTS "Allow all for authenticated users" ON sale_items;
CREATE POLICY "Allow all for authenticated users" ON sale_items
  FOR ALL USING (true);

-- ================================
-- AUTO USER PROFILE CREATION TRIGGER
-- ================================

-- Function to handle new user registration
CREATE OR REPLACE FUNCTION handle_new_user() 
RETURNS TRIGGER AS $$
BEGIN
  INSERT INTO public.users (id, email, full_name, role, status)
  VALUES (
    NEW.id, 
    NEW.email, 
    COALESCE(NEW.raw_user_meta_data->>'full_name', 'User'),
    COALESCE(NEW.raw_user_meta_data->>'role', 'cashier'),
    'active'
  );
  RETURN NEW;
END;
$$ LANGUAGE plpgsql SECURITY DEFINER;

-- Create trigger that runs after user signup
DROP TRIGGER IF EXISTS on_auth_user_created ON auth.users;
CREATE TRIGGER on_auth_user_created
  AFTER INSERT ON auth.users
  FOR EACH ROW EXECUTE FUNCTION handle_new_user();

-- ================================
-- SUCCESS MESSAGE
-- ================================
SELECT 
  'Database setup completed successfully!' as message,
  (SELECT COUNT(*) FROM categories) as categories_count,
  (SELECT COUNT(*) FROM products) as products_count,
  (SELECT COUNT(*) FROM customers) as customers_count;