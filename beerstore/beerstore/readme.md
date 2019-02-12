# Projeto

* indicando ao ``lombok`` para gerar o `hash code and equals` apenas um campo

    
        @EqualsAndHashCode(onlyExplicitlyIncluded = true)
        public class Beer {
            @EqualsAndHashCode.Include
            private Long id;
        }
        
* se hover erro com o ``lombok`` tentando converter objeto `booleanos`, utilizar

    
        //se necessario, especificamos a versao do lombok, no caso de erro ao converter boolean
        ext['lombok.version'] = '1.18.0'        
        
        