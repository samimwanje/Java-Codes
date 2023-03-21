var xhr = new XMLHttpRequest();
xhr.onreadystatechange = function() {
  if (this.readyState == 4 && this.status == 200) {
    // Request successful
  }
};
xhr.open("POST", "/upload", true);
xhr.timeout = 60000; // Set timeout to 60 seconds
xhr.send(formData);