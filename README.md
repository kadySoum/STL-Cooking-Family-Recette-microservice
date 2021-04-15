# STL-Cooking-Family-Recette-microservice

Post de recette (recette.service) 


Pour lancer le microservice 

```
 mvn spring-boot:run
```

Pour ajouter une recette :

```
curl -X POST localhost:8080/cookapis/recettes/ -H 'Content-type:application/json' -d ' {
    "title": "Tiramisu",
    "description": "recette dessert italien...",
    "ingredients":["mascarpone","cacao","oeuf"],
    "auteurId": "5",
    "photoId" : ["1675"],
    "published": "true"
}'

```

Pour afficher toutes les recettes :

```
http://localhost:8080/cookapis/recettes
```

ou avec postman
