#!/bin/bash
# 同步进度：把 PROGRESS.md 复制到桌面，然后提交
# 用法：./sync.sh

set -e

SRC="/c/Users/ZhuanZ/java-learning/PROGRESS.md"
DST="/c/Users/ZhuanZ/Desktop/Java学习进度.md"

cp -f "$SRC" "$DST"
echo "已同步到桌面"

cd /c/Users/ZhuanZ/java-learning
git add -A

if git diff --cached --quiet; then
  echo "没有改动需要提交"
  exit 0
fi

git commit -m "sync: 进度同步 $(date '+%m-%d %H:%M')"
echo "已提交"

git push && echo "已推送" || echo "推送失败（检查网络或公钥），本地提交已保存"
