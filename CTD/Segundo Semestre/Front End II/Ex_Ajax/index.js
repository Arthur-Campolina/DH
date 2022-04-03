fetch ('https://api.thecatapi.com/v1/images/search?category_ids=7&limit=10')
    .then(function(result) {
        return result.json();
    })
    .then(function(cats) {
        let catImages = document.getElementById('cat_images');

        cats.forEach(function (cat) {
            let div = document.createElement('div');
            let img = document.createElement('img');

            img.src = cat.url
            img.width = 400;

            div.appendChild(img)
            catImages.appendChild(div)
        })
    })
    .catch(function(error) {
        console.log(error)
    })