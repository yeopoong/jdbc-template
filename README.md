# jdbc-template

스프링 부트에서는 클래스 패스 아래에 다음과 같은 SQL 파일이 존재하면 그것을 읽어들여 실행한다.
- schema-플랫폼.sql
- schema.sql
- data-플랫폼.sql
- data.sql

플랫폼 부분의 기본값은 all 이며, 애플리케이션을 시작할 때 spring.datasource.platform=xxx를 지정하여 변경
