let fileURL = document.querySelector('#fileURL');    // Get the file url element.
const queryString = window.location.search;         // Get the params.
const link = location.origin+'/upload/pngs/' +queryString.split('=')[1] // Split the params and get the page url.
fileURL.innerHTML += `<a href="${link}" target="_blank">${link}</a>`    // Change the file url element with image location data.
