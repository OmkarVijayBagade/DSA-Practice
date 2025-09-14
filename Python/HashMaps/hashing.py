hash_map = {}

hash_map['name']='Omkar'
hash_map['age']=21
hash_map['city']='Pune'

print(hash_map['name'])

if 'age' in hash_map:
    print(f"Age is present: {hash_map['age']}")

for key,value in hash_map.items():
    print(key,':',value)

