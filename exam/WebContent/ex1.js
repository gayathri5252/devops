function fun1(){
var id = document.registration.ID.value;
var pass = document.registration.Password.value;

if(fun2(id,4,12)){
if(fun2(pass,4,12)){
allLetters(id);
}
}

var name = document.registration.Name.value;
var email = document.registration.Email.value;
var zip = document.registration.Zip.value;

var genders = document.getElementsByName("Gender");
var selectedGender;

for(var i = 0; i < genders.length; i++) {
if(genders[i].checked)
selectedGender = genders[i].value;
}

var address = document.registration.Address.value;
var language = document.registration.Language.value;
var country = document.registration.Country.value;
var about = document.registration.About.value;

alert( id+ " " + pass+ " " +name +" " +email +" " +zip +" " +selectedGender +" " +address +" " +language +" " +country +" " +about);

}

function fun2(uid,mx,my){
var uid_len = uid.length;
if(uid_len > my || uid_len < mx || uid_len==0 ){
alert("uid invalid");
uid.focus();
return false;
}
return true;

}


function allLetters(uid){
var letters = /^[A-Za-z]+$/;
if(uid.match(letters)){
return true;
}
else{
alert("uid must be only alphabets");
uid.focus();
return false;
}
}
function ValidateEmail(g)
{
	var mailformat=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+S/;
	if(g.match(mailformat))
		{
		return true;
		}
	else
		{
		alert("you have entered an invalid email address!");
		g.focus();
		return false;
		}
	}
    