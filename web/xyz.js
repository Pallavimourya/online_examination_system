function demo()
{
	x=document.getElementById('t1').value;
	var re=/\d{8}/;
	
	if(re.test(x))
	{
//	document.getElementById('s1').innerHTML="welcome";
        y=document.getElementById('form');
        y.submit();
	}
	else{
//	document.getElementById('s1').innerHTML="invalid";
        alert("password fill atleast 8-numbers");
	}
}
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


