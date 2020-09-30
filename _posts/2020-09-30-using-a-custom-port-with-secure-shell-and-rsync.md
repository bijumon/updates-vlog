---
title: using a custom port with secure shell and rsync
date: 2020-09-30 08:35 +0530
---

``` shell 
$ rsync -arvz -e 'ssh -p 4567' --progress _site/ user@website.org:/home/user/Sites/www

$ ssh -p 4567 user@website.org
```
