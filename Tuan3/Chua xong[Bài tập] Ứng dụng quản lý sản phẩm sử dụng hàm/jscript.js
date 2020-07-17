let producname = ["Alcatel-Lucent", "ZTE", "Lenovo", "LG", "Xiaomi", "Vivo", "Oppo", "Huawei", "Apple", "Samsung"];
htmlElement = "";
let id=[]
for (let i = 0; i < producname.length; i++) {
    htmlElement += `
<tr>
    <td>${producname[i]}</td>
    <td><button>Edit</button></td>
    <td><button onclick="delete()">Delete</button></td>
</tr>

`
}
document.getElementById('container3').innerHTML = htmlElement;