// global variable
var data;

$.get('Sample.json', function(d) {
    data = JSON.parse(d);
    // loop through all movies
    alert(data);
    data.Movies.forEach(function(b) {
        // now you can put every movie in your <div>

        $("#Movie-Grid").append(`<div class=\"MovieCard\"><div class=\"Mov-Img-Container\"><div class=\"Movie-Img\"><img src = \" ${b.Title}\" title=${b.Title} width=\"180px\"  ></div></div><div class=\"Movie-Name\">${b.Title}</div><div class=\"Movie-Year\">${b.Year}</div></div>`);
    });
});