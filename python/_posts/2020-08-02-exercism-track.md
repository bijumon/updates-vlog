---
title: exercism-track
date: 2020-08-02 09:00 +0530
---
I am working through Exercism's [Python Track](https://exercism.io/my/tracks/python) coding practice. 

## Setup
The command line client is available in the Arch User Repository, [exercism](https://aur.archlinux.org/packages/exercism/).

``` shell
> yay -Ss exercism
aur/exercism 3.0.13-1 (+6 0.72) 
    Command line client for https://exercism.io
aur/exercism-bin 3.0.13-2 (+69 1.73) 
    Command line client for exercism.io

> yay -S exercism-bin # prebuilt binary, doesn't require golang

> yay -Ql exercism-bin
exercism-bin /usr/
exercism-bin /usr/bin/
exercism-bin /usr/bin/exercism
...

> exercism help

> exercism configure --workspace ~/Exercism

# [Python | Hello World | Exercism](https://exercism.io/my/solutions/04bcc66509104f5c91ccb6cc39280a64)
> exercism download --exercise=hello-world --track=python
```

## Hello World

``` python
# pytest hello_world_test.py 
===================================================================================== test session starts =====================================================================================
platform linux -- Python 3.8.5, pytest-6.0.1, py-1.9.0, pluggy-0.13.1
rootdir: /home/user0/Exercism/python/hello-world
collected 1 item                                                                                                                                                                              

hello_world_test.py F                                                                                                                                                                   [100%]

========================================================================================== FAILURES ===========================================================================================
_________________________________________________________________________________ HelloWorldTest.test_say_hi __________________________________________________________________________________

self = <hello_world_test.HelloWorldTest testMethod=test_say_hi>

    def test_say_hi(self):
>       self.assertEqual(hello(), "Hello, World!")
E       AssertionError: None != 'Hello, World!'

hello_world_test.py:10: AssertionError
=================================================================================== short test summary info ===================================================================================
FAILED hello_world_test.py::HelloWorldTest::test_say_hi - AssertionError: None != 'Hello, World!'
====================================================================================== 1 failed in 0.50s ======================================================================================
``` python
# hello_world.py

def hello():
    return 'Hello, World!'

# pytest hello_world_test.py 
===================================================================================== test session starts =====================================================================================
platform linux -- Python 3.8.5, pytest-6.0.1, py-1.9.0, pluggy-0.13.1
rootdir: /home/user0/Exercism/python/hello-world
collected 1 item                                                                                                                                                                              

hello_world_test.py .                                                                                                                                                                   [100%]

====================================================================================== 1 passed in 0.02s ======================================================================================
```

