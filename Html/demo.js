function f(){
	alert("Button Clicked, this message is from external file");
}
function f1(a,b,c){
	alert(a);
	alert(b);
	alert(c);
}

function myConcat(sep){
	var(var i=0;i<arguments.length;i++){
		result=result+arguments[i]+sep;
	}
	return result;
}