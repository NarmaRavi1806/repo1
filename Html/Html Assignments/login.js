function validate(){
var username = document.getElementById("username").value;
var password = document.getElementById("password").value;
if ( username == "Narmatha" && password == "narma123"){
//alert ("Login successfully");
window.open("https://github.com/NarmaRavi1806?tab=repositories"); // Redirecting to other page.
return false;
}
else{
alert ("Invalid username and password");
return false;
}

}