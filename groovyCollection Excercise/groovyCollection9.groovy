String s="this string needs to be split "
println  s.tokenize("")
println s.tokenize()
println  s.tokenize(/\s/)
println  s .split("")
println s.split(/\s/)

String s1="are.you.trying.to.split.me.mister?"
println s1.tokenize(".")
println s1.split(".")