# POS System

A modern, comprehensive Point of Sale (POS) system built with React, Vite, Bootstrap, Tailwind CSS, and **Supabase Backend**.

## 🚀 Features

### Core Features
- **Dashboard** - Sales summary, today's revenue, analytics charts
- **Billing/POS Screen** - Fast product search, cart management, invoice print/PDF
- **Inventory Management** - Add/edit items, categories, stock tracking, low stock alerts
- **Purchase Management** - Supplier invoices, stock management
- **Customer Management** - Customer profiles, purchase history, loyalty points
- **Repairs/Service Jobs** - Ticket management with status tracking (pending/in-progress/completed)
- **Returns & Warranty** - Return processing and warranty tracking
- **Reports & Analytics** - Daily/weekly/monthly reports, best-sellers analysis
- **Settings** - Tax configuration, discounts, payment methods
- **User Management** - Admin, manager, and cashier roles with permissions
- **Low Stock Alerts** - Automatic notifications for inventory
- **Barcode/Search Support** - Quick product lookup

### Backend Features (Supabase)
- **🔐 Authentication** - Secure user login/logout with role-based access
- **🗄️ PostgreSQL Database** - Robust relational database with full SQL support
- **📡 Real-time Updates** - Live data synchronization across all clients
- **🔒 Row Level Security** - Database-level security policies
- **📊 Auto-generated APIs** - REST and GraphQL APIs with no configuration
- **🔄 Database Triggers** - Automatic stock updates and calculations
- **📈 Analytics Support** - Built-in analytics and reporting capabilities
- **💾 Automatic Backups** - Daily database backups and point-in-time recovery
- **🌐 Global CDN** - Fast data access worldwide
- **📧 Email Integration** - Built-in email services for notifications

### Technical Features
- **Modern UI** - Clean, responsive design with Bootstrap 5.3+ and Tailwind CSS 3.3+
- **Hybrid Styling** - Best of both worlds: Bootstrap components + Tailwind utilities
- **Real-time Updates** - Live dashboard with current data
- **Multi-user Support** - Role-based access control
- **Print/PDF Support** - Invoice and receipt generation
- **Mobile Responsive** - Works on all devices
- **Fast Search** - Quick product and customer lookup
- **Data Visualization** - Charts and analytics with Recharts
- **Enhanced Animations** - Smooth transitions and interactions

## 🛠️ Tech Stack

- **Frontend**: React 18, Vite
- **Backend**: Supabase (PostgreSQL + Real-time + Auth)
- **Styling**: Bootstrap 5.3+ & Tailwind CSS 3.3+ (Hybrid approach)
- **Icons**: Lucide React
- **Charts**: Recharts
- **Routing**: React Router DOM
- **UI Components**: Bootstrap Components + Custom Tailwind utilities
- **Database**: PostgreSQL with Row Level Security
- **Authentication**: Supabase Auth with JWT tokens
- **Real-time**: WebSocket connections via Supabase
- **APIs**: Auto-generated REST & GraphQL endpoints

## 📦 Installation

### Prerequisites
- Node.js 16+ 
- npm or yarn
- Supabase account (free tier available)

### Quick Start

1. Clone the repository:
```bash
git clone <repository-url>
cd pos-system
```

2. Install dependencies:
```bash
npm install
```

3. Set up Supabase backend:
```bash
# Follow the detailed guide in SUPABASE_SETUP.md
# Or use demo mode for quick testing
```

4. Configure environment variables:
```bash
cp .env.example .env
# Edit .env with your Supabase credentials
```

5. Start the development server:
```bash
npm run dev
```

6. Open your browser and navigate to `http://localhost:3000`

### Backend Setup

For full backend functionality, follow the detailed setup guide:

📖 **[Complete Supabase Setup Guide](./SUPABASE_SETUP.md)**

Or use **Demo Mode** for immediate testing (no backend required).

## 🎨 Styling Architecture

This project uses a **hybrid styling approach** combining the best of both frameworks:

### Bootstrap 5.3+
- **Components**: Cards, buttons, forms, modals, dropdowns, alerts
- **Layout**: Grid system, containers, responsive utilities
- **Interactive Elements**: Dropdown menus, tooltips, popovers

### Tailwind CSS 3.3+
- **Utilities**: Spacing, colors, typography, flexbox, grid
- **Custom Styling**: Quick prototyping and fine-tuning
- **Responsive Design**: Mobile-first responsive utilities

### Why Hybrid Approach?
- **Rapid Development**: Bootstrap components for complex UI patterns
- **Fine Control**: Tailwind utilities for precise styling
- **Consistency**: Bootstrap's design system + Tailwind's flexibility
- **Best Performance**: Purged unused CSS from both frameworks

## 🚀 Deployment to Vercel

1. Build the project:
```bash
npm run build
```

2. Install Vercel CLI (if not already installed):
```bash
npm install -g vercel
```

3. Deploy to Vercel:
```bash
npm run deploy
# OR
vercel
```

Or push to GitHub and connect your repository to Vercel for automatic deployments.

## 👥 Default Users

The system comes with demo users for testing:

- **Admin**: username: `admin`, password: `admin`
- **Cashier**: username: `cashier`, password: `cashier`

## 🎨 Styling Examples

### Bootstrap Components
```jsx
// Cards with Bootstrap
<div className="card card-custom">
  <div className="card-body">
    <h5 className="card-title">Bootstrap Card</h5>
    <p className="card-text">Using Bootstrap components.</p>
    <button className="btn btn-primary btn-custom">Bootstrap Button</button>
  </div>
</div>
```

### Tailwind Utilities
```jsx
// Quick styling with Tailwind
<div className="bg-white rounded-lg shadow-lg p-6">
  <h3 className="text-xl font-bold mb-4">Tailwind Styling</h3>
  <button className="bg-blue-500 hover:bg-blue-600 text-white px-4 py-2 rounded-lg transition-colors">
    Tailwind Button
  </button>
</div>
```

### Hybrid Approach
```jsx
// Combining both frameworks
<div className="card card-custom bg-gradient-to-r from-blue-500 to-purple-600">
  <div className="card-body text-white">
    <h5 className="card-title font-bold">Best of Both Worlds</h5>
    <p className="card-text opacity-90">Bootstrap structure + Tailwind utilities</p>
  </div>
</div>
```

## 📱 Usage

### Getting Started
1. Login with demo credentials
2. Explore the dashboard to see sales overview
3. Use the billing screen to process sales
4. Manage inventory through the inventory section
5. View reports and analytics

### Key Workflows
- **Making a Sale**: Go to Billing → Search products → Add to cart → Process payment
- **Adding Products**: Go to Inventory → Add Product → Fill details
- **Processing Returns**: Go to Returns → Create return → Process refund
- **Managing Users**: Go to Users → Add User → Assign role and permissions

## 🔧 Configuration

### Settings Available
- Store information and tax rates
- Payment method configuration
- Discount settings
- Inventory thresholds
- Receipt customization
- User permissions

## 📊 Reports

The system provides comprehensive reporting:
- Sales trends and revenue analysis
- Best-selling products
- Customer analytics
- Inventory reports
- Financial summaries

## 🔐 Security Features

- Role-based access control
- Secure user authentication
- Permission-based UI rendering
- Data validation and sanitization

## 🚀 Production Deployment

### Environment Variables
Create a `.env` file for production settings:
```
VITE_API_URL=your-api-url
VITE_STRIPE_KEY=your-stripe-key
```

### Build for Production
```bash
npm run build
npm run preview
```

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License.

## 🆘 Support

For support and questions, please open an issue in the repository.

---

**Note**: This is a demo application. For production use, implement proper backend API integration, database storage, and security measures.