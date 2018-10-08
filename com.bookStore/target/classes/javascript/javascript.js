
function validationform()                                    
{ 
    var name = document.forms["bookform"]["bookName"];               
    var email = document.forms["bookform"]["email"];    
    var price = document.forms["bookform"]["price"];  
    var id = document.forms["bookform"]["id"]; 

    if (name.value == "")                                  
    { 
        window.alert("Please enter your name."); 
        name.focus(); 
        return false; 
    } 
return true;
}
/////////////////////////////////////////////////
function formvalid()
{
var uid=document.forms.bookName;
var pwd=document.forms.authoreName;

if (validuid(uid,5,16)){
if(passvalid(pwd,6,12)){
}
}
return false;

}

function validuid(uid,mx,my)
{
var ulen=uid.value.length;
if(ulen == 0 || ulen < mx || ulen > my)
{
document.getElementById("demo").innerHTML="UID MUST BE IN 5 TO 16"
alert("user id must be in between 8 to 16");
uid.focus();
return false;

}
return true;
} 
function passvalid(pwd,mx,my)
{
var plen=pwd.value.length;
if(plen == 0 || plen < mx || plen > my)
{
document.getElementById("demo1").innerHTML="pwd MUST BE IN 5 TO 16"
<!-- alert("user id must be in between 8 to 16"); >
pwd.focus();
return false;

}
return true;
}
