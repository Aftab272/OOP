import React from 'react';

const Dashboard = () => {
  // Mock data for dashboard
  const stats = [
    { name: 'Total Revenue', value: '$45,231.89', change: '+20.1% from last month', icon: '💰' },
    { name: 'Orders', value: '12,234', change: '+18.2% from last month', icon: '📋' },
    { name: 'Products', value: '1,234', change: '+5.3% from last month', icon: '📦' },
    { name: 'Customers', value: '5,234', change: '+12.4% from last month', icon: '👥' },
  ];

  const recentOrders = [
    { id: 'ORD-001', customer: 'John Doe', amount: '$125.00', status: 'Completed' },
    { id: 'ORD-002', customer: 'Jane Smith', amount: '$89.50', status: 'Processing' },
    { id: 'ORD-003', customer: 'Robert Johnson', amount: '$245.75', status: 'Completed' },
    { id: 'ORD-004', customer: 'Emily Davis', amount: '$67.25', status: 'Pending' },
    { id: 'ORD-005', customer: 'Michael Wilson', amount: '$198.00', status: 'Completed' },
  ];

  return (
    <div className="p-6">
      <div className="mb-6">
        <h1 className="text-2xl font-bold text-gray-800">Dashboard</h1>
        <p className="text-gray-600">Welcome to your POS dashboard</p>
      </div>

      {/* Stats Cards */}
      <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6 mb-8">
        {stats.map((stat, index) => (
          <div key={index} className="bg-white rounded-xl shadow-md p-6 hover:shadow-lg transition-shadow duration-300">
            <div className="flex items-center justify-between">
              <div>
                <p className="text-sm font-medium text-gray-600">{stat.name}</p>
                <p className="text-2xl font-bold text-gray-900 mt-1">{stat.value}</p>
                <p className="text-xs text-green-600 mt-1">{stat.change}</p>
              </div>
              <div className="text-3xl">{stat.icon}</div>
            </div>
          </div>
        ))}
      </div>

      {/* Recent Orders */}
      <div className="grid grid-cols-1 lg:grid-cols-2 gap-6">
        <div className="bg-white rounded-xl shadow-md p-6">
          <div className="flex items-center justify-between mb-6">
            <h2 className="text-lg font-bold text-gray-800">Recent Orders</h2>
            <button className="text-blue-600 hover:text-blue-800 text-sm font-medium">
              View All
            </button>
          </div>
          <div className="space-y-4">
            {recentOrders.map((order) => (
              <div key={order.id} className="flex items-center justify-between pb-4 border-b border-gray-100 last:border-0 last:pb-0">
                <div>
                  <p className="font-medium text-gray-900">{order.id}</p>
                  <p className="text-sm text-gray-600">{order.customer}</p>
                </div>
                <div className="text-right">
                  <p className="font-medium text-gray-900">{order.amount}</p>
                  <span className={`text-xs px-2 py-1 rounded-full ${
                    order.status === 'Completed' ? 'bg-green-100 text-green-800' :
                    order.status === 'Processing' ? 'bg-yellow-100 text-yellow-800' :
                    'bg-red-100 text-red-800'
                  }`}>
                    {order.status}
                  </span>
                </div>
              </div>
            ))}
          </div>
        </div>

        {/* Chart Placeholder */}
        <div className="bg-white rounded-xl shadow-md p-6">
          <h2 className="text-lg font-bold text-gray-800 mb-6">Sales Overview</h2>
          <div className="bg-gradient-to-r from-blue-50 to-indigo-50 rounded-lg h-64 flex items-center justify-center">
            <div className="text-center">
              <div className="text-4xl mb-2">📊</div>
              <p className="text-gray-600">Sales Chart Visualization</p>
              <p className="text-sm text-gray-500 mt-1">Interactive chart would appear here</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Dashboard;