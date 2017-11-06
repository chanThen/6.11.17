angular.module('myApp')
	.service("subscribeService",['$http',function ($http)
    {

      this.payToSubscribe = function payToSubscribe(userId,bookId,callback){
        var url = "http://localhost:8080/BookWorld/rest/subscribe/addToSubscribe?userId="+userId+"&bookId="+bookId;
        $http.post(url).then(callback, function(error){
            return (error);
        });     
     }   
   }]);
