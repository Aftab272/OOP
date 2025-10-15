# Database Setup Instructions

## Step 1: Run Main Schema
1. Go to your Supabase Dashboard: https://app.supabase.com
2. Select your project: `rsrhsxpvarwklkyqwozk`
3. Go to **SQL Editor**
4. Copy and paste the entire content from `supabase-schema.sql`
5. Click **Run** to create all tables

## Step 2: Setup User Trigger
1. In the same SQL Editor
2. Copy and paste the content from `supabase-user-trigger.sql`
3. Click **Run** to create the user profile trigger

## Step 3: Test Sign Up
1. Go to your POS System: http://localhost:3003
2. Click "Create one here" to sign up
3. Fill in the form and submit
4. Check your Supabase Dashboard > Authentication > Users to see the new user
5. Check Table Editor > users to see the user profile was created

## What This Does:
- ✅ Creates all necessary database tables
- ✅ Sets up user authentication with automatic profile creation
- ✅ Enables proper data storage for all POS features
- ✅ Creates sample data (categories, products, settings)

## After Setup:
- Users can sign up and their data gets saved to the database
- Login will work with real authentication
- All POS features will store data permanently
- Role-based access control will work properly

## Troubleshooting:
If you get any errors, make sure:
1. Your Supabase project is active
2. You have the correct permissions
3. Run the schema first, then the trigger