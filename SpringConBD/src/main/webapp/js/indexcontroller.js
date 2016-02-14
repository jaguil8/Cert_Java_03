//indexcontroller.js
var AppClubs = angular.module('AppClubs',[]);

AppClubs.controller('mostrarClubs', function($scope, $http){
    
    $scope.cargarClubParaEdicion = function(idClub){
        for(var k = 0; k < $scope.listaCompletaDeClubs.length; k++){
            if($scope.listaCompletaDeClubs[k].id === idClub){
                $scope.clubActual = $scope.listaCompletaDeClubs[k];
            }
        }
    }
    
    //Llamada a get con callback
    $scope.cargarClubs = function(){
        $http.get('clubs')
                .success(function(data, status){
                    $scope.listaCompletaDeClubs = data;
                });
    };
    
    $scope.guardarClub = function(){
        $scope.estaGuardando = true;
        if(typeof $scope.clubActual.id != 'undefined'){
            $http.put('clubs', $scope.clubActual)
                    .success(function(data, status){
                        $scope.clubActual = {};
                        $scope.cargarClubs();
                        $scope.estaGuardando = false;
                    })
                    .error(function(data, status){
                        console.log('ERROR:', data);
                        $scope.estaGuardando = false;
                    });
        }
        else{
            $http.post('clubs', $scope.clubActual)
                    .success(function(data, status){
                        //$scope.listaCompletaDeClubs.push($scope.nuevoClub);
                        $scope.clubActual = {};
                        $scope.cargarClubs();
                        $scope.estaGuardando = false;
                    })
                    .error(function(data, status){
                        console.log('ERROR:', data);
                        $scope.estaGuardando = false;
                    });
        }
    };
    
    $scope.eliminarClub = function(idClub){
        $http.delete('clubs/' + idClub)
                .success(function(data, status){
                    $scope.cargarClubs();
                })
                .error(function(data, status){
                    console.log('ERROR:', data);
                });
    }

    $scope.saludo = "Hola mundo";
    $scope.clubActual = {};
    $scope.cargarClubs();
});