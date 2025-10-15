# Professional Portfolio Website

A modern, responsive portfolio website built with HTML, CSS, JavaScript, Bootstrap, and Vite.

## Features

- Responsive design that works on all devices
- Smooth scrolling navigation
- Animated sections with intersection observer
- Skills section with progress bars
- Project showcase with images
- Contact form
- Social media links
- Scroll to top button

## Technologies Used

- HTML5
- CSS3
- JavaScript (ES6+)
- Bootstrap 5
- Vite.js

## Getting Started

### Prerequisites

- Node.js (version 14 or higher)
- npm or yarn

### Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```bash
   cd portfolio
   ```

3. Install dependencies:
   ```bash
   npm install
   ```

### Development

To start the development server:

```bash
npm run dev
```

The site will be available at `http://localhost:5173` (or the next available port).

### Building for Production

To create a production build:

```bash
npm run build
```

The build files will be generated in the `dist` folder.

### Previewing the Production Build

To preview the production build locally:

```bash
npm run preview
```

## Deployment

### Deploying to Vercel

1. Install the Vercel CLI:
   ```bash
   npm install -g vercel
   ```

2. Login to your Vercel account:
   ```bash
   vercel login
   ```

3. Deploy the site:
   ```bash
   npm run deploy
   ```

   Or directly:
   ```bash
   vercel --prod
   ```

## Customization

1. Update the content in `index.html`
2. Replace images in the `public/images` folder
3. Modify styles in `src/style.css`
4. Update JavaScript functionality in `src/main.js`

## Project Structure

```
portfolio/
├── public/
│   └── images/
├── src/
│   ├── main.js
│   └── style.css
├── index.html
├── package.json
└── vercel.json
```

## License

This project is licensed under the MIT License.