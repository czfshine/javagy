str=io.open("data.txt","r"):read("*a")
l=1000
i=0
function get()

l=l+1

return l
end


l2=10000

function gets()

l2=l2+1
return l2
end

str:gsub("(.-)\n",function (line) _,n=line:gsub("ѧԺ","")

if
 n >0
 then
i=get()
 print(tostring(i).."00000:{\n\n},")

 else
line:gsub("(.-)%s",function(s) print((i-1)*10000+gets(),":'"..s.."',") end )
 end


 end)
