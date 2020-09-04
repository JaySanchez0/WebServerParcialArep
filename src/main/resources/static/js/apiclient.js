var client = (function(){
    return{
        sort:function(list,show){
            var pr = $.post({
                url:"/sort",
                data:JSON.stringify(list),
                contentType:"application/json"
            });
            pr.then((data)=>show(data),()=>alert("error"));
        },calculate:function(list,show){
            var pr =$.post({
                url:"/dataOperation",
                data:JSON.stringify(list),
                contentType:"application/json"
            });
            pr.then((data)=>show(data),()=>alert("error"));
        }
    };
})();