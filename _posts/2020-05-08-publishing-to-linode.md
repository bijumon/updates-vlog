---
title: Publishing a static site to a VPS (linode)
---

generate the static files, output in **_site**

``` sh
> bundle exec jekyll build
```

upload files to remote server using rsync. *-e* spawns a custom remote program to communicate between local and remote copies of rsync, in our case, ssh client on a custom port [1]. *-a --archive* mode preserves file modes and permissions (except hardlinks), enables recursion, equivalent to [*-rlptgoD*](https://download.samba.org/pub/rsync/rsync.1). *-z --compress* file data is compressed before sending.

``` sh
> rsync -avz -e 'ssh -p 6667' --progress _site/ www@mysite.com:/var/www/Sites/mysite.com/www
```

[1] custom ssh port can be specified in `~/.ssh/config` instead of at the command-line.
