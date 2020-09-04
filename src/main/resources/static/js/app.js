var app = (function(){
    var list = [];
    var showSort= function(list){
        console.log(list);
        var resp = "";
        list.forEach((elm)=> resp=resp+" "+elm);
        $("#sorted").text(resp);
    }
    var showCalculate=function(ob){
        console.log(ob);
        $("#sum").text(ob.sum);
        $("#average").text(ob.average);
    }
    return{
        add:function(){
            list.push(parseFloat($("#n").val()));
            $("#numbers").text($("#numbers").text()+" "+$("#n").val());
        },clear:function(){
            list = [];
            $("#numbers").text("");
        },sort:function(){
            client.sort(list,showSort);
        },calculate:function(){
            client.calculate(list,showCalculate);
        }

    }
})();