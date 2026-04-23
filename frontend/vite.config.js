import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vite.dev/config/
export default defineConfig({
  server :{
    port : 3002,
    proxy :{ 
      '/api': 'http://localhost:3000'
    }
  },
  plugins: [react()],
})
