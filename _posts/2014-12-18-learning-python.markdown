---
tags: [ python ]
---

I am trying to [learn](http://pymbook.readthedocs.org/en/py3/) the
[python](http://python.org) language and a bit of
*[ipython](http://ipython.org)*.

    print "Python 3"
    # SyntaxError: Missing parentheses in call to 'print'

    print("OOPS!")
    # OOPS!

Start executable scripts with a *hashbang*

    #!/usr/bin/env python

[Zed]() suggests starting all files with below or similar

    # -*- coding: utf-8 -*-

together now

    #!/usr/bin/env python
    # -*- coding: utf-8 -*-

Create a python script

    # my-name-is.py

    import sys
    print("my name is " + sys.argv[0] + " Slim Shady!")

    # Execute our script
    $ chmod +x my-name-is.py
    $ ./my-name-is.py Anna

### Using [argparse](https://docs.python.org/3/library/argparse.html) to create a command line

    from argparse import ArgumentParser

    parser = ArgumentParser(description="argument parser test")

    parser.add_argument('--content', help="PATH to content directories")
    parser.add_argument('--output', help="PATH to store website")
    args = parser.parse_args()

    print(args.content)
    print(args.output)
