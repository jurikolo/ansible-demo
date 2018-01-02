* ansible all -m ping
* cat roles/init/vars/authorized_keys.yml
* ansible-vault encrypt roles/init/vars/authorized_keys.yml
* cat roles/init/vars/authorized_keys.yml
* ansible-vault view roles/init/vars/authorized_keys.yml
* ansible-playbook init.yml --ask-pass --ssh-common-args='-o PreferredAuthentications=password'
* ansible all -m ping
