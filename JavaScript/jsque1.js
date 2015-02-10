function si(){

var amount=prompt("enter amount","amount");
if(amount!=null){

	var year=prompt("enter year","year");

	if(year!=null){

		var rate=prompt("enter rate","rate");
		if(amount!=null){
			var si=(amount*year*rate)/100;
			document.getElementById("interst").innerHTML=si;
			
			}
		}
	}
}






