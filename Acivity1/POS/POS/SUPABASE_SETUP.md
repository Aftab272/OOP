# Supabase Backend Setup Guide

This guide will help you set up Supabase backend for your POS system.

## 🚀 Quick Setup

### 1. Create Supabase Project

1. Go to [supabase.com](https://supabase.com)
2. Sign up/Login to your account
3. Click "New Project"
4. Choose your organization
5. Enter project details:
   - **Name**: `pos-system`
   - **Database Password**: Choose a strong password
   - **Region**: Select closest to your location
6. Click "Create new project"

### 2. Get Project Credentials

After your project is created:

1. Go to **Settings** → **API**
2. Copy the following:
   - **Project URL** (looks like: `https://xqwlqupfpxlpvmqbapzr.supabase.co`)
   - **Project API Key** (anon, public key)

### 3. Update Environment Variables

1. Open the `.env` file in your project root
2. Replace the placeholder values:

```env
VITE_SUPABASE_URL=https://your-project-ref.supabase.co
VITE_SUPABASE_ANON_KEY=your-anon-key-here
```

### 4. Create Database Schema

1. In your Supabase dashboard, go to **SQL Editor**
2. Click "New Query"
3. Copy the entire content from `supabase-schema.sql` file
4. Paste it in the SQL Editor
5. Click "Run" to execute the schema

This will create:
- ✅ All required tables (products, sales, customers, etc.)
- ✅ Relationships between tables
- ✅ Indexes for performance
- ✅ Row Level Security (RLS)
- ✅ Sample data for testing

### 5. Configure Authentication

1. Go to **Authentication** → **Settings**
2. Configure the following:

**Site URL**: `http://localhost:3000` (for development)

**Redirect URLs**: Add these URLs:
- `http://localhost:3000/**`
- `https://your-domain.com/**` (for production)

**Email Templates**: Customize if needed

### 6. Set Up Storage (Optional)

For product images and receipts:

1. Go to **Storage**
2. Create a new bucket named `pos-files`
3. Set it to **Public** if you want direct access to images
4. Configure policies as needed

## 🗄️ Database Tables Created

The schema creates these tables:

| Table | Purpose |
|-------|---------|
| `categories` | Product categories |
| `products` | Product inventory |
| `customers` | Customer information |
| `suppliers` | Supplier details |
| `users` | User accounts and roles |
| `sales` | Sales transactions |
| `sale_items` | Individual items in sales |
| `purchases` | Purchase orders |
| `purchase_items` | Items in purchase orders |
| `repairs` | Repair service tickets |
| `returns` | Return transactions |
| `return_items` | Items being returned |
| `settings` | Application settings |

## 🔐 Authentication Features

### Built-in Features:
- ✅ Email/Password authentication
- ✅ User profiles and roles
- ✅ Session management
- ✅ Password reset
- ✅ Email verification

### Demo Accounts:
The system includes demo login functionality for testing:
- **Admin Demo**: Full access
- **Manager Demo**: Limited admin access
- **Cashier Demo**: POS and basic features

## 📡 Real-time Features

Your POS system includes real-time updates:

- ✅ **Live Inventory Updates**: Stock changes instantly across all clients
- ✅ **Sales Monitoring**: Real-time sales dashboard
- ✅ **User Activity**: See who's online and active
- ✅ **Low Stock Alerts**: Instant notifications

## 🔧 Advanced Configuration

### Row Level Security (RLS)

The database uses RLS for security. Current policies allow all operations for authenticated users. You can modify these in **Authentication** → **Policies**.

### Custom Functions

You can add custom PostgreSQL functions in the SQL Editor for:
- Complex business logic
- Automated calculations
- Data validation
- Custom triggers

### API Access

Supabase auto-generates REST and GraphQL APIs:
- **REST API**: `https://your-project.supabase.co/rest/v1/`
- **GraphQL**: `https://your-project.supabase.co/graphql/v1`

## 🚀 Deployment Setup

### For Production:

1. **Update Environment Variables**:
```env
VITE_SUPABASE_URL=https://your-project.supabase.co
VITE_SUPABASE_ANON_KEY=your-production-key
```

2. **Configure Authentication**:
   - Update Site URL to your production domain
   - Add production redirect URLs
   - Enable email confirmations if needed

3. **Security Settings**:
   - Review and update RLS policies
   - Configure custom SMTP for emails
   - Set up database backups

## 🔍 Testing the Setup

1. **Start your development server**:
```bash
npm run dev
```

2. **Test Authentication**:
   - Try demo login buttons
   - Check if user data loads correctly
   - Verify logout functionality

3. **Test Database**:
   - View products in inventory
   - Check real-time updates
   - Test CRUD operations

## 📚 API Usage Examples

### Authentication
```javascript
import { useAuth } from './hooks/useAuth'

const { user, signIn, signOut } = useAuth()

// Sign in
await signIn('user@example.com', 'password')

// Sign out
await signOut()
```

### Database Operations
```javascript
import { productService } from './services/productService'

// Get all products
const { data: products } = await productService.getProducts()

// Create product
const { data: newProduct } = await productService.createProduct({
  name: 'iPhone 15',
  price: 999.99,
  stock: 10
})

// Update stock
await productService.updateStock(productId, 5, 'subtract')
```

### Real-time Updates
```javascript
import { useRealtimeData } from './hooks/useRealtimeData'

// Subscribe to product changes
const { data: products, loading } = useRealtimeData('products')

// Products will automatically update when data changes
```

## 🆘 Troubleshooting

### Common Issues:

1. **"Invalid API Key"**:
   - Check if VITE_SUPABASE_ANON_KEY is correct
   - Verify the key is from the right project

2. **"Database Connection Failed"**:
   - Ensure database schema is created
   - Check if VITE_SUPABASE_URL is correct

3. **"Authentication Failed"**:
   - Verify authentication settings in Supabase
   - Check if Site URL is configured correctly

4. **"Permission Denied"**:
   - Review RLS policies
   - Check if user has required permissions

### Getting Help:

- 📖 [Supabase Documentation](https://supabase.com/docs)
- 💬 [Supabase Discord](https://discord.supabase.com)
- 🐛 [GitHub Issues](https://github.com/supabase/supabase/issues)

## ✅ Next Steps

After setting up Supabase:

1. **Test all authentication flows**
2. **Verify database operations**
3. **Check real-time updates**
4. **Configure production settings**
5. **Set up monitoring and backups**
6. **Deploy to production**

Your POS system now has a powerful, scalable backend with real-time capabilities! 🎉