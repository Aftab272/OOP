-- ===================================
-- QUICK FIX: Disable Email Confirmation
-- Copy and paste this into Supabase SQL Editor
-- ===================================

-- First, let's create a simple test to disable email confirmation
-- This allows immediate login after signup

-- Check current auth settings
SELECT 
  id, 
  email,
  email_confirmed_at,
  created_at
FROM auth.users 
ORDER BY created_at DESC 
LIMIT 5;

-- Update any unconfirmed users to be confirmed (for testing)
UPDATE auth.users 
SET email_confirmed_at = NOW() 
WHERE email_confirmed_at IS NULL;

-- Show updated users
SELECT 
  id, 
  email,
  email_confirmed_at,
  created_at
FROM auth.users 
ORDER BY created_at DESC 
LIMIT 5;

SELECT 'Email confirmation updated for existing users. Try signing in now!' AS message;