// navbar.js

document.addEventListener("DOMContentLoaded", function() {
    // Fetch the navbar.html and insert it into the placeholder div
    fetch("navbar.html")
        .then(response => response.text())
        .then(data => {
            document.getElementById("navbar-placeholder").innerHTML = data;
        })
        .catch(error => console.error('Error loading navbar:', error));
});
