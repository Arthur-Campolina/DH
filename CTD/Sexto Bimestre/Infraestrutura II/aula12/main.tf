data "aws_region" "current" {}

resource "aws_vpc" "my_vpc" {
  source = "terraform-aws-modules/vpc/aws"

  name = "${var.namespace}-my-vpc"
  cidr = "10.0.0.0/16"

  tags = {
    name = "${var.namespace}-my-vpc"
  }
}

resource "aws_subnet" "my_subnet" {
  vpc_id     = aws_vpc.my_vpc.id
  cidr_block = "10.0.1.0/24"

  tags = {
    Name = "${var.namespace}-my-subnet"
  }
}