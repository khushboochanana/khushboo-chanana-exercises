function checkPalindrome(){


var a= document.getElementById("t1").value;
var f=1;
for(i=a.length,j=0;i>=a.length/2;i--,j++)
    {
document.getElementById("show1").innerHTML=i;
        if( a[i] != a[j])
                f=0;
}
	if(f==1)
	document.getElementById("show").innerHTML="the word is palindrome.";
	else
            document.getElementById("show").innerHTML="the word is not palindrome!";
        

	
}

