module.exports = {
    devServer: {
        port: 8080,
        proxy: {
            '/api': {
                target: 'https://localhost:8083/', //API服务器的地址
                changeOrigin: true,
                secure: false,
                ws: true,
                pathRewrite: {
                    '^/api': ''
                }
        },
    }
 }
}