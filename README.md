# image_utility library for Abilists \[ [www.abilists.com](http://www.abilists.com)\]
--------------------------------------------------
[![Build Status](https://travis-ci.org/abilists/image_utility.svg?branch=master)](https://travis-ci.org/abilists/image_utility)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/abilists/image_utility)

image_utility is to resize the images in Server Side.

#### About
image_utility has a few special features:

* resize Image
* resize Image with 64

#### Runtime Requirements

- *P1:* Java8 or newer
- *P2:* Junit test

#### How to Install
Build as blow
```
$ gradle install
```
Add the following code into build.gradle in your new project.
```
compile 'io.utility:image:0.0.2'
```
#### Get started
Add the following code into your business class.
```
File file = new File("/home/user/img/");
BufferedImage resizeImagePng = ImgUtility.resizeImage64(pngimageData.toString(), 200, 200);
ImageIO.write(resizeImagePng, "png", file);
```

#### License

image_utility is distributed under the MIT License.

#### Thank you!

I really appreciate all kind of feedback and contributions. 
