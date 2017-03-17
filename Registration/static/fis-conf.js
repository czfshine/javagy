fis.match('*.js', {
    useHash: true,
    optimizer: fis.plugin('uglify-js'),
    url: '.$0'
});

fis.match('*.css', {
    useHash: true,
    optimizer: fis.plugin('clean-css'),
    url: '.$0'
});

fis.match('*.png', {
    optimizer: fis.plugin('png-compressor')
});

fis.match('*.tmpl', {
    parser: fis.plugin('bdtmpl'),
    rExt: '.js'
});

fis.match('*.html', {
    url: './$0'
});
