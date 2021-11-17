const BundleAnalyzerPlugin = require('webpack-bundle-analyzer').BundleAnalyzerPlugin;

module.exports = {
    mode: "none",
    output: {
        filename: 'titan-ui.js',
    },
    plugins: [
        //new BundleAnalyzerPlugin()
    ],

    module: {
        rules: [
            // https://github.com/graphql/graphql-js/issues/2721#issuecomment-723008284
            // Because:
            // Module not found: Error: Can't resolve './error' in '.. node_modules/graphql'
            // Because WebPack 5 made a breaking change.
            // Because the JS Ecosystem is **fun**.
            {
                test: /\.m?js/,
                resolve: {
                    fullySpecified: false
                }
            }
        ]}
};
