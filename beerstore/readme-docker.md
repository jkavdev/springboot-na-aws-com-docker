# Docker

* baixando a imagem do ``postgres`` e configurando alguns passos
* ``-p 5432:5432`` informando a posta interna e a porta que sera exposta pelo `container`
* ``--name beerstoredb`` nome da instancia no `docker`
* ``-e POSTGRES_USER=beerstore -e POSTGRES_PASSWORD=beerstore -e POSTGRES_DB=beerstoredb``
*       configurando as variaveis que a imagem nos possibilita
* ``-d postgres:10.5-alpine`` definindo qual versao em especifico a ser baixada

    
        docker run -p 5432:5432 --name beerstoredb -e POSTGRES_USER=beerstore -e POSTGRES_PASSWORD=beerstore -e POSTGRES_DB=beerstoredb -d postgres:10.5-alpine
        
* exibindo todas as imagens instaladas no ``docker``

    
        docker ps -a
        
* parando uma imagem no ``docker``

    
        docker stop imagem-id                
        
* rodando uma imagem no ``docker``

    
        docker start imagem-id                
        
        