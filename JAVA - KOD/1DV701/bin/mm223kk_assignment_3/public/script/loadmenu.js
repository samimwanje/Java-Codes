let createmenu = document.querySelector('#loadmenu');

let myDiv = document.createElement('div');

myDiv.innerHTML = '<ul id="menu"><li><a class="sections" href= "/" > Home </a></li>'
+'<li><a class="sections" href= "/upload" > Upload</a></li>'
+'<li><a class="sections" href= "/about" > About</a></li>'
+'<li><a id="aboutme" style="margin-left: 20px" href="https://lnu.se/en/" target="_blank" rel="noopener noreferrer">|&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspLinnaeus University</a>'
+'</li></ul> ';

createmenu.appendChild(myDiv);