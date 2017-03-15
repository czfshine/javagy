// default settings. fis3 release

// Global start
fis.match('*.{js,css}', {
  //useHash: true
});

fis.match('::image', {
  useHash: true
});

fis.match('*.js', {
  
    url: '.$0'
});

fis.match('*.css', {
  optimizer: fis.plugin('clean-css'),
    url: './$0'
});

fis.match('*.png', {
  optimizer: fis.plugin('png-compressor')
});

fis.match('*.tmpl', {
  parser: fis.plugin('bdtmpl'),
    rExt: '.js'
});

fis.match('*.html', {
url: './$0'});
// Global end

// default media is `dev`
fis.media('dev')
  .match('*', {
    useHash: false,
    optimizer: null
  });

// extends GLOBAL config
fis.media('production');