# java-learning

从零开始学 Java 的每日记录。2026 年 11 月 1 日起，每天至少一次提交。

## 进度打卡

| 阶段 | 时间 | 状态 |
| --- | --- | --- |
| Java 语法 + 面向对象 | 2026.11 | 进行中 |
| 集合 / 异常 / IO / 多线程 | 2026.12 上 | 未开始 |
| MySQL | 2026.12 | 未开始 |
| SpringBoot + MyBatis-Plus | 2027.1 | 未开始 |
| 项目 MVP | 2027.2 | 未开始 |

## 每天怎么提交

学完当天内容，在本目录打开终端（Git Bash），执行三条命令：

```bash
git add -A
git commit -m "day03 学了 if 和 for"
git push
```

或者用一键脚本，省事：

```bash
./commit.sh "day03 学了 if 和 for"
```

## 目录说明

- `src/dayNN/` —— 每天写的代码，按天分目录
- `notes/` —— 每天的学习笔记，照模板写就行
- `README.md` —— 进度打卡表，每过一周更新一次状态

## 环境

- JDK 24.0.1（2027 年 1 月开始学 SpringBoot 时换成 JDK 21 LTS）
- Git 2.55.0
- 编辑器：先用任意文本编辑器，装上 IDEA 后改用 IDEA

## 备注

- 编译报编码错误时，加参数：`javac -encoding UTF-8 HelloWorld.java`
- 提交历史比提交质量重要。写得烂也要提交，连续记录本身就是价值
