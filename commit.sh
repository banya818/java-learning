#!/bin/bash
# 一键打卡：把当天的代码和笔记提交并推送到 GitHub
# 用法：./commit.sh "day05 学了面向对象"

set -e

msg="${1:-每日打卡}"

git add -A

if git diff --cached --quiet; then
  echo "今天没有任何改动。先写点代码或笔记，再来打卡。"
  exit 0
fi

git commit -m "$msg"
git push

echo ""
echo "已提交并推送：$msg"
