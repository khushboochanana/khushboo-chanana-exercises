File f = new File("no white space output")
f.text = ''
new File("a.txt").text.getChars().each {
if(it != ' ' && it!='\t' && it!='\n')
  f<<it
}
f.text