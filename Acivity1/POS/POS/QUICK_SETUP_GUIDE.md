# Quick Database Setup Guide

## 🎯 **Goal:** Save all signup and POS data to your Supabase database

## 📋 **Step-by-Step Instructions:**

### **Step 1: Open Supabase Dashboard**
1. Go to: https://app.supabase.com
2. Login to your account
3. Select your project: `rsrhsxpvarwklkyqwozk`

### **Step 2: Create Database Tables**
1. Click on **"SQL Editor"** in the left sidebar
2. Click **"New query"**
3. Open the file: `SIMPLE_DATABASE_SETUP.sql` in your project folder
4. **Copy ALL the content** from that file
5. **Paste it** into the SQL Editor
6. Click **"Run"** button
7. Wait for "Success" message

### **Step 3: Test Your Setup**
1. Go to your POS System: http://localhost:3003
2. Click **"Create one here"** to sign up
3. Fill the signup form:
   - Name: Your Name
   - Email: your@email.com
   - Role: Admin/Manager/Cashier
   - Password: your_password
4. Click **"Create Account"**
5. You should see success message

### **Step 4: Verify Data is Saved**
1. Go back to Supabase Dashboard
2. Click **"Table Editor"** in sidebar
3. Click **"users"** table
4. You should see your new user data!

## ✅ **What Gets Saved:**
- ✅ User signup data (name, email, role)
- ✅ Products and inventory data
- ✅ Sales and transactions
- ✅ Customer information
- ✅ All POS system data

## 🚀 **After Setup:**
- Sign up works with real database
- Login works with your saved credentials
- All POS features save data permanently
- Multi-user system with roles

## ❓ **Need Help?**
If you see any errors:
1. Make sure you copied the ENTIRE SQL script
2. Check that your Supabase project is active
3. Try running the script again

Your data will now be saved permanently in Supabase! 🎉