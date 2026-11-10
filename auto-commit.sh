#!/bin/bash
# 自动提交脚本：有改动就提交并推送，没有就静默退出
# 供 Windows 任务计划定时调用，也可以手动跑

cd /c/Users/ZhuanZ/java-learning || exit 1

git add -A

if git diff --cached --quiet; then
  exit 0
fi

git commit -m "auto: 自动提交 $(date '+%m-%d %H:%M')" >/dev/null

GIT_SSH_COMMAND="ssh -o BatchMode=yes -o ConnectTimeout=20" git push >/dev/null 2>&1

exit 0
