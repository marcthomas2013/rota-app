function Hello($scope, $http) {
    $http.get('http://localhost:8080').
        success(function(data) {
            $scope.user = data;
        });
}