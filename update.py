#!/usr/bin/env python

import os
from urllib import parse

HEADER = """# 
# 백준 & 프로그래머스 문제 풀이 목록

프로그래머스의 경우, 푼 문제 목록에 대한 마이그레이션이 필요합니다.

"""

def main():
    content = HEADER
    directories = []
    solveds = []

    for root, dirs, files in os.walk("."):
        dirs.sort()

        if root == '.':
            for d in ('.git', '.github'):
                if d in dirs:
                    dirs.remove(d)
            continue

        category = os.path.basename(root)
        directory = os.path.basename(os.path.dirname(root))

        if category == 'images' or directory == '.':
            continue

        if directory not in directories:
            if directory in ["백준", "프로그래머스"]:
                content += "## 📚 {}\n".format(directory)
            else:
                content += "### 🚀 {}\n".format(directory)
                content += "| 문제번호 | 링크 |\n"
                content += "| -------- | ---- |\n"
            directories.append(directory)

        for file in files:
            if category not in solveds:
                path = os.path.join(root, file).replace("\\", "/")
                content += "| {} | [링크]({}) |\n".format(category, parse.quote(path))
                solveds.append(category)

    with open("README.md", "w", encoding="utf-8") as f:
        f.write(content)

if __name__ == "__main__":
    main()
