# API Hola Mundo con Spring Boot

API minima en Spring Boot lista para desplegar en Render y luego conectar con un frontend.

## Endpoint disponible

- `GET /api/hola`

Respuesta:

```json
{
  "mensaje": "Hola mundo",
  "estado": "ok"
}
```

## Ejecutar en local

```bash
mvn spring-boot:run
```

La API quedara disponible en:

```text
http://localhost:8080/api/hola
```

## Desplegar en Render

Render actualmente no ofrece Java como runtime nativo en su lista principal, asi que este proyecto queda preparado para desplegarse con Docker.

1. Sube este proyecto a GitHub.
2. En Render, crea un nuevo `Web Service`.
3. Conecta el repositorio.
4. En `Environment`, selecciona `Docker`.
5. Si Render detecta el `Dockerfile`, no necesitas definir `Build Command`.
6. Tampoco necesitas `Start Command`, porque Render ejecuta el `CMD` o `ENTRYPOINT` del `Dockerfile`.
7. Despliega el servicio.

## Conectar un frontend despues

Cuando tengas tu frontend desplegado, cambia la variable de entorno:

```text
CORS_ALLOWED_ORIGINS=https://tu-frontend.com
```

Si necesitas varios dominios, puedes separarlos por coma.
