data "aws_ami" "amazon-linux-2" {
 most_recent = true

 filter {
   name   = "owner-alias"
   values = ["amazon"]
 }

 filter {
   name   = "name"
   values = ["amzn2-ami-hvm*"]
 }
}

resource "aws_instance" "ec2_public1" {
 ami                         = data.aws_ami.amazon-linux-2.id
 associate_public_ip_address = true
 instance_type               = "t2.micro"
 subnet_id                   = var.my_subnet_id

 tags = {
   "Nome" = "${var.namespace}-EC2-PUBLIC"
 }
}

resource "aws_instance" "ec2_public2" {
 ami                         = data.aws_ami.amazon-linux-2.id
 associate_public_ip_address = true
 instance_type               = "t2.micro"
 subnet_id                   = var.my_subnet_id

 tags = {
   "Nome" = "${var.namespace}-EC2-PUBLIC"
 }
}
