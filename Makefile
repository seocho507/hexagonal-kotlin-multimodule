CONTAINER_NAME=redis
REDIS_PORT=6379
REDIS_VERSION=latest

redis-start:
	docker run -d --rm --name $(CONTAINER_NAME) -p $(REDIS_PORT):6379 redis:$(REDIS_VERSION)

redis-cli:
	docker exec -it $(CONTAINER_NAME) redis-cli

redis-monitor:
	docker exec -it $(CONTAINER_NAME) redis-cli monitor

redis-stop:
	docker stop $(CONTAINER_NAME)

redis-log:
	docker logs $(CONTAINER_NAME)
