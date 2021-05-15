rm -rf ./jars/*
for dir in `find ./ -name "*.jar"`
do
  cp $dir ./jars
  done

ls
docker build -f ./user-provider/Dockerfile -t user-provider .
docker build -f ./user-consumer/Dockerfile -t user-consumer .
docker login --username=奈文摩尔_1995 --password=950519lz registry.cn-hangzhou.aliyuncs.com
docker tag 79800c567b02 registry.cn-hangzhou.aliyuncs.com/private_proj/user-provider:1.0.0
docker push registry.cn-hangzhou.aliyuncs.com/private_proj/user-provider:1.0.0
